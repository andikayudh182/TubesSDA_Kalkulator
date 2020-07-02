//====================================
// Program	: nbtree.c
// Desc		: Main project dari 
// Author	: Sanjaya Wisnu R.
// Versi	: 3.0/ 8 Mei 2020
//===================================
#include "nbtree.h"



int main(){
	Isi_Tree P; //tree yang dibuat
	int count, choice; 
	int leaf, level, depth, element;
	infotype find;
	
	do{
		printf("===============================================\n");
		printf("===============================================\n");
		printf("                    Main Menu\n");
		printf("===============================================\n");
		printf("===============================================\n");
		printf("1. Isi Tree\n");
		printf("2. Show Tree Visualization\n");
		printf("3. Show Each Node Data\n");
		printf("4. Traversing Pre,Post,In,Level Order\n");
		printf("5. Number of Element, Leaf, Level, Depth, and Root\n");
		printf("0. Exit\n");
		printf("Choice : ");
		scanf("%d", &choice);
		switch(choice){
			case 1 :
				printf("Input Number of tree node (MAX 20): "); scanf("%d", &count);
				Create_tree(P, count);
				system("pause");
				break;
				
			case 2 :
				PrintTree(P);
				printf("\n\n====================================\n");
				system("pause");
				break;
				
			case 3 :
				PrintDataTree(P, 1);
				printf("\n\n====================================\n");
				system("pause");
				break;
				
			case 4 :
				printf("\n\n\nTraversing\n");
				printf("\n PreOrder \n");
				PreOrder(P, 1);
				printf("\n InOrder \n");
				InOrder(P, 1);
				printf("\n PostOrder \n");
				PostOrder(P, 1);
				printf("\n LevelOrder \n");
				Level_order(P, count);
				printf("\n\n====================================\n");
				system("pause");
				break;
				
			case 5 :
				element = nbElmt(P);
				leaf =  nbDaun(P, count);
				depth =  Depth(P);
				printf("\n\n\n\nNumber of Element : %d\n", element);
				printf("Leaf : %d\n", leaf);
				printf("Depth : %d\n", depth);
				printf("Root : %s\n", P[1].info);
				printf("\n\n====================================\n");
				system("pause");
				break;
			
			case 0 :
				system("exit");
				break;
			
			default :
				printf("\nWrong input\n");
				break;
		}
		
	}while (choice != 0);
}
