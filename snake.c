#include <stdio.h>
#include <windows.h>
#include <stdlib.h>

void main(){
	int ch;
	int aux = 77;
	int i,j;
	char campo[12][12];
	typedef struct ofsnake{
		char on;
		int x;
		int y;	
	}cell;
	
	srand(time(NULL));
	int GameOver=0;
	int indice=3;
	int flagmorta=0;
	int foodshow = 0;
	int flagfood = 0;
	int pontos = 0;
	cell snake[100];
	cell temp;
	snake[0].on = 'O';
	snake[0].x = 4;
	snake[0].y = 5;
	snake[1].x = 3;
	snake[1].y = 5;
	snake[2].x = 2;
	snake[2].y = 5;
	snake[3].x = 1;
	snake[3].y = 5;
	for(i=1;i<11; i++){
		for(j=1; j<11; j++){
			campo[i][j]=' ';				
		}
	}

	while(GameOver != 1){
		for(i=1;i<20;i++){
			if(kbhit() && getch() != ch)
				ch = getch();
			Sleep(10);
			if(flagfood == 0)
				foodshow += rand() % 7;

				if(foodshow > 600){
					foodshow=0;
					flagfood=1;
					int x;
					int y;
					do{
					flagmorta=0;
					x = (rand() % 11)+1;
					y = (rand() % 11)+1;
					for(j=1; j<indice;j++){
						if((snake[j].x == x) && (snake[j].y == y)){
							flagmorta = 1;
							j=indice;
						}
					}
					}while(x < 1 || x > 10 || y < 1 || y > 10 || flagmorta);
					campo[y][x] = 'X';
					temp.x = x;
					temp.y = y;
				}				
		}
		system("cls || clear");
		if(snake[0].y == temp.y && snake[0].x == temp.x){
			indice++;
			flagfood=0;
			pontos+=50;
			}
		for(i=indice;i > 0; i--){
			snake[i].x = snake[i-1].x;
			snake[i].y = snake[i-1].y;
		}
		for(i=1; i<indice+1; i++)
			snake[i].on = 'o';
		snake[indice].on = '.';



		

		switch(ch){
			case 75: //esquerda
				if(aux != 77)
					aux = ch;
					break;
			case 72: //cima
				if(aux != 80)
					aux = ch;
					break;
			case 77: //direita
				if(aux !=  75)
					aux = ch;
					break;
			case 80: //baixo
				if(aux != 72)
					aux = ch;
					break;
			default:
				break;
		}
		switch(aux){
			case 75: //esquerda				
				snake[0].x -= 1;
				break;
			case 72: //cima
				snake[0].y -= 1;
				break;
			case 77: //direita
				snake[0].x += 1;
				break;
			case 80: //baixo
				snake[0].y += 1;
				break;
			default:
				break;
		}
		
		for(i=0;i < indice+1; i++)
			campo[snake[i].y][snake[i].x] = snake[i].on;

		for(i=1;i<11; i++){
			for(j=1; j<11; j++){
				printf("%c ", campo[i][j]);
			}
			printf("%d\n", i);
		}
			printf("1 2 3 4 5 6 7 8 9 10");
			campo[snake[indice].y][snake[indice].x] = ' ';
			if(snake[0].x > 10 || snake[0].x < 1 || snake[0].y > 10 || snake[0].y < 1)
				GameOver=1;
			for(i=1 ; i < indice + 1; i++){
				if(snake[0].x == snake[i].x && snake[0].y == snake[i].y)
					GameOver=1;
			}
		//	printf("\n\n Head: %d %d %c", snake[0].x,snake[0].y,snake[0].on);
		//	printf("\n 1: %d %d %c", snake[1].x,snake[1].y,snake[1].on);
		//	printf("\n 2: %d %d %c", snake[2].x,snake[2].y,snake[2].on);
		//	printf("\n 3: %d %d %c", snake[3].x,snake[3].y,snake[3].on);
		//	printf("\n Indice: %d \n FoodFlag: %d \n foodshow: %d", indice, flagfood, foodshow);
			printf("\n\nPontos: %d", pontos);
	}
	system("cls || clear");
	printf("\n GAME OVER \n");
	getch();
}