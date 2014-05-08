#include <windows.h>

#define BPM 200

#define Dint 4
#define Dmin 2
#define Dsmin 1
#define Dcol 0.5
#define Dscol 0.25
#define Dfusa 0.125
#define Dsfusa 0.0625

#define Atop 2
#define Amid 1
#define Abot 0.5

#define Ndo  261.63
#define Ndoh 277.18
#define Nre  293.66
#define Nreh 311.13
#define Nmi  329.63
#define Nfa  349.23
#define Nfah 369.99
#define Nso  392.00
#define Nsoh 415.30
#define Nla  440.00
#define Nlah 466.16
#define Nsi  493.88

#define Npa  20000.00


void music(float nota, float altura, float dr){
     float pr1 = (nota == Npa ? nota : nota * altura);
     float pr2 = 1000 * (dr/(BPM/60));
     Beep(pr1,pr2);
     }

void ab1(){
    music(Npa,Amid,Dcol);
    music(Ndo,Amid,Dcol);
    music(Nre,Amid,Dcol);
    music(Nmi,Amid,Dsmin);
    music(Nso,Amid,Dsmin);
    music(Nso,Amid,Dsmin);
    music(Nmi,Amid,Dsmin);
    music(Nfa,Amid,Dsmin);
    music(Nfa,Amid,Dsmin);
    music(Npa,Amid,Dcol);
     }

void ab2(){
    music(Npa,Amid,Dcol);
    music(Ndo,Amid,Dcol);
    music(Nre,Amid,Dcol);
    music(Nmi,Amid,Dsmin);
    music(Nso,Amid,Dsmin);
    music(Nso,Amid,Dsmin);
    music(Nfa,Amid,Dsmin);
    music(Nmi,Amid,Dmin);  
    music(Npa,Amid,Dcol);
     }

void ab3(){
    music(Ndo,Amid,Dcol);
    music(Ndo,Amid,Dcol);
    music(Nre,Amid,Dcol);
    music(Nmi,Amid,Dsmin);
    music(Nso,Amid,Dsmin);
    music(Npa,Amid,Dcol);    
    music(Nso,Amid,Dcol);
    music(Nfa,Amid,Dcol);
    music(Nmi,Amid,Dcol);    
    music(Ndo,Amid,Dsmin);
    music(Nfa,Amid,Dsmin);
    music(Npa,Amid,Dcol);   
    
    music(Nmi,Amid,Dcol);
    music(Nmi,Amid,Dcol);
    music(Nre,Amid,Dcol);
    music(Nre,Amid,Dsmin);
    music(Nmi,Amid,Dsmin);
    music(Npa,Amid,Dcol);

    music(Nre,Amid,Dcol);
    music(Nre,Amid,Dcol);
    music(Ndo,Amid,Dcol);
    music(Ndo,Amid,Dmin);
    music(Npa,Amid,Dcol);
     }


void asabranca(){
     ab1();
     ab2();
     ab3();
     ab3();
     }

void alegria(){
music(Nmi,Amid,Dsmin);
music(Nmi,Amid,Dsmin);
music(Nfa,Amid,Dsmin);
music(Nso,Amid,Dsmin);
music(Nso,Amid,Dsmin);
music(Nfa,Amid,Dsmin);
music(Nmi,Amid,Dsmin);
music(Nre,Amid,Dsmin);
music(Ndo,Amid,Dsmin);
music(Ndo,Amid,Dsmin);
music(Nre,Amid,Dsmin);
music(Nmi,Amid,Dsmin);
music(Nmi,Amid,Dmin);
music(Nre,Amid,Dcol);
music(Nre,Amid,Dsmin);
}


int main(){
    alegria();
    return 0;
}
