import re
import sys


def isValid(cpf):

    if "*" in cpf:
        return False
    cpf = re.sub(r"[^0-9]", "", cpf)
    cpf = cpf.zfill(11)

    pList = [x for x in range(10, 1, -1)]
    sList = [x for x in range(11, 1, -1)]

    cCpf = cpf[:9]

    pdigi = sum([int(x) * int(y) for x, y in zip(cCpf, pList)])
    pdigi = 0 if pdigi % 11 < 2 else 11 - pdigi % 11
    cCpf = cCpf + str(pdigi)

    sdigi = sum([int(x) * int(y) for x, y in zip(cCpf, sList)])
    sdigi = 0 if sdigi % 11 < 2 else 11 - sdigi % 11
    cCpf = cCpf + str(sdigi)
    cCpf = cCpf.zfill(11)

    return True if cpf == cCpf else False


def cpFormat(cpf):
    cpf = re.sub(r"[^0-9\*]", "", cpf)
    return str("{}.{}.{}-{}".format(cpf[:3], cpf[3:6], cpf[6:9], cpf[9:]))


def cpFix(x):
    y = []
    for cpf in x:
        cpf = re.sub(r"[^0-9]", "", cpf)
        if cpf == "":
            cpf = "*" * 11
        cpf = cpf.zfill(11)
        y.append(cpf)
    return y
