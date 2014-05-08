from time import sleep
import serial
import sys

class Sms:
    def __init__(self,rcpt='000',msg='Mensagem nula',isp='nenhum'):
        self.rcpt = rcpt
        self.msg = msg
        self.isp = isp
        
    def setRcpt(self, num):
        self.rcpt = num
        
    def setMsg(self, text):
        self.msg = text
        
    def setIsp(self, operadora):
        num = operadora.upper()
        if (num == 'TIM'):
            num = '+552181138200'
        elif (num == 'CLARO'):
            num = '+555191115300'
        elif (num == 'VIVO'):
            num = '+550101102010'
        elif (num == 'OI'):
            num = '+550310000010'
        else:
            num = '+0000'
        self.isp = num
        self.atCommand('AT+CSCA="'+self.isp+'"\r\n')
        
    def connect(self,port=None,baudrate=460800):
        self.con = serial.Serial(port, baudrate, timeout=5)
        self.atCommand('ATZ')
        self.atCommand('AT+CMGF=1')

    def clsbuffer(self):
        while self.con.inWaiting() > 0:
            self.con.read()
            sleep(0.1)

    def send(self):
        list = []
        list.append(self.atCommand('AT+CMGW="'+self.rcpt+'",145'))
        list.append(self.atCommand(self.msg + '\x1a'))
        list.append(self.atCommand(''))
        try:
          if list[1][1]:
              if list[1][1].startswith('+CMGW'):
                pr = list[1][1][7:]
                self.clsbuffer()
                list.append(self.atCommand('AT+CMSS='+pr))
                list.append(self.atCommand(''))
                list.append(self.atCommand('AT+CMGD='+pr))
                list.append(self.atCommand(''))
          return list
        except:
            print(list)
            return ['ERROR 000']

    def disconnect(self):
        self.con.close()

    def atCommand(self,cmd):
        while self.con.inWaiting() > 0:
            self.con.read()
            sleep(0.1)
        self.con.write(bytes(cmd+"\r\n", encoding='ascii'))
        sleep(0.5)
        ret = []
        while self.con.inWaiting() > 0:
            msg = self.con.readline().strip()
            sleep(0.1)
            msg = msg.replace(b"\r",b"")
            msg = msg.replace(b"\n",b"")
            if msg != b"":
                ret.append(str(msg, encoding='ascii'))
        return ret

    def delMsg(self,index=None,flag=None):
        cmd=None
        if index:
            cmd='AT+CMGD='+str(index)
            if flag:
                cmd=','+str(flag)
        return self.atCommand(cmd)
        
    def recv(self):
        list = self.atCommand('AT+CMGL="ALL"')
        x = []
        for line in list:
            if line.startswith('AT+') == False:
                if line != 'OK':
                    x.append(line)
        x = ','.join(x)
        x = x.split('+CMGL: ')
        xlist = []
        for y in x:
            y = y.split(',')
            if y != [] and y != ['']:
                xlist.append(y)
        return xlist
