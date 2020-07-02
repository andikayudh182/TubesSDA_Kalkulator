//====================================
// Program	: nbtree.c
// Desc		: Body dari nbtree.h
// Author	: Sanjaya Wisnu R.
// Versi	: 3.0/ 8 Mei 2020
//===================================
#include "nbtree.h"


void Create_tree(Isi_Tree X, int Jml_Node){
	char alpha;
	int i;
	/* Insialisasi tree (tree kosong)
	set semua info diisi kosong (spasi)*/
	for(i=1;i<=jml_maks;i++){
		strcpy(X[i].info, " "); // string diisi spasi sebagai penanda bahwa string kosong
		strcpy(X[i].couple, " ");
		X[i].firstSon = 0;
		X[i].nextBrother = 0;
		X[i].parent = 0;
		X[i].level = -1;
	}
	
	//Masukan jumlah node dan menginputkan Root
	if(Jml_Node > 20){
		printf("Over Capacity (MAX = 20)\n");
	}else{
		printf("\nInput Node Root : "); fflush(stdin); gets(X[1].info);
		printf("Tree Root is %s\n",X[1].info);
		
		//pengkondisian serta pengisian apakah node memiliki pasangan atau tidak
		printf("Does Node Have a Couple ?(y/n) : "); fflush(stdin); scanf("%c",&alpha);
		alpha = tolower(alpha);
		if(alpha != 'y'){
			printf("Node is Single\n");
		}else{
			printf("Input node Couple : "); fflush(stdin); gets(X[1].couple);
		}
		
		X[1].level = 0;
		Insert(X, Jml_Node, 1);
	}
}
// Create Non Binary Tree sebanyak Jml_Node
// Tujuan mengentrykan Non Binary Tree ke array Isi_Tree dengan pola Level Order 
// Jml Node adalah banyaknya elemen dalam Tree yang menjadi parameter input

void Insert(Isi_Tree X, int Jml_Node, int index){
	int last = 1, dot, i, temp;
	int tempIdx;
	char alpha;
	
	//Cek last
	while(strcmp(X[last].info, " ")!= 0){
		last++;
	}
	//input child
	printf("\nSum of Child %s : ", X[index].info );fflush(stdin);
	scanf("%d", &dot);
	//Node akan menjadi daun jika jumlah anak 0
	if(dot == 0){
		printf(" Node %s turn into a leaf\n",X[index].info); 
	}else{
		for(i=0;i<dot;i++){
			//line untuk input parent
			if(last>Jml_Node){
				printf(" Overflow\n");
				break;
			//Input	
			}else{
				//pengkondisian serta pengisian apakah node memiliki pasangan atau tidak
				printf("\n Child Number %d : ", i+1);fflush(stdin); gets(X[last].info);
				printf("Does node have a couple ?(y/n) : "); fflush(stdin); scanf("%c",&alpha);
				alpha = tolower(alpha);
				if(alpha != 'y'){
					printf("Node is Single\n");
				}else{
					printf("Enter node Couple : "); fflush(stdin); gets(X[last].couple);
				}
				
				X[last].parent = index;
				temp = index;
				if(i == 0){
					tempIdx = last;
					X[index].firstSon = last;
					X[last].level = X[temp].level+1;
				}else{
					X[last-1].nextBrother = last;
					X[last].level = X[last-1].level;
				}
				last++;
			}
		}
		for(i=0;i<dot;i++){
			if(last <= Jml_Node){
				Insert(X, Jml_Node, tempIdx);
				tempIdx++;
			} else break;
		}
	}
}
//Melakukan insert Child pada tree setelah insert root
//Insert akan dilakukan terus menerus sampai memenuhi jumlah yang diinginkan (diinputkan)

boolean IsEmpty (Isi_Tree P){
	if(P[1].info == " "){
		return 1;
	} else 
		return 0;
}
/* Mengirimkan true jika Isi_Tree KOSONG */



/***** Traversal *****/

void PreOrder (Isi_Tree P, int index){
	if(IsEmpty(P)){
		printf("Nil\n");
	}else{
		printf("%s ",P[index].info);
		//Cek anak, jika punya maka di akses dan seterusnya
		if(P[index].firstSon != 0){
			index = P[index].firstSon;
			PreOrder(P, index);
			while(P[index].nextBrother != 0){
				index = P[index].nextBrother;
				PreOrder(P,index);
			}
		}
	}
}
/* Traversal PreOrder */
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditampilkan secara PreOrder : Parent, fs, nb */


void InOrder (Isi_Tree P, int index){
	int idx = index;
	if(IsEmpty(P)){
		printf("Nil\n");
	}else{
		if(P[idx].firstSon !=0){
			idx = P[idx].firstSon;
			InOrder(P, idx);
			printf("%s ",P[index].info);
			while(P[idx].nextBrother != 0){
				idx = P[idx].nextBrother;
				InOrder(P,idx);
			}
		}else{
			printf("%s ",P[idx].info);
		}
	}
}
/* Traversal InOrder */
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditampilkan secara InOrder : fs, Parent, Sisa anak lain */

void PostOrder (Isi_Tree P, int index){
	int temp;
	if(IsEmpty(P)){
		printf("Nil\n");
	}else{ 
		temp = index;
		if(P[index].firstSon != 0){
			index = P[index].firstSon;
			PostOrder(P, index);
			while(P[index].nextBrother != 0){
				index = P[index].nextBrother;
				PostOrder(P, index);
			}
		}
		printf("%s ",P[temp].info);
	}
}
/* Traversal PostOrder */
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditampilkan secara PostOrder :  fs, nb, Parent */

void Level_order(Isi_Tree X, int Maks_node){
	int lvl = Depth(X);
	int i, j;
	if(IsEmpty(X)){
		printf("Nil\n");
	}else{
		for(j=0;j<=lvl;j++){
			for(i=1;i<=Maks_node;i++){
				if(X[i].level == j){
					printf("%s ", X[i].info);
				}
			}
		}
	}
}
/* Traversal LevelOrder */
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditampilkan secara preorder */

void PrintNode (Isi_Tree P, int index){
	printf("\n\nData		: %s\n",P[index].info);
	
	if(strcmp(P[index].couple, " ")== 0){
		printf("Mate		: -\n");
	}else{
		printf("Mate		: %s\n",P[index].couple);
	}
	
	if(index == 1){
		printf("Parent		: -\n");
	}else{
		printf("Parent		: %s\n",P[P[index].parent].info);
	}	
	
	if(P[index].firstSon == 0){
		printf("First Son	: -\n"); 
	}else{
		printf("First Son	: %s\n",P[P[index].firstSon].info);
	}
	
	if(P[index].nextBrother == 0){
		printf("Next Brother	: -\n");
	}else{
		printf("Next Brother	: %s\n",P[P[index].nextBrother].info);
	}
	
	printf("Level		: %d\n\n",P[index].level);
}
// IS : P terdefinisi
// FS : Mencetak data lengkap dari sebuah node

void PrintDataTree (Isi_Tree P, int index){
	if(IsEmpty(P)){
		printf("Nil\n");
	}else{
		PrintNode(P, index);
		//Cek anak, jika punya maka akan di akses begitu seterusnya
		if(P[index].firstSon != 0){
			index = P[index].firstSon;
			PrintDataTree(P, index);
			while(P[index].nextBrother != 0){
				index = P[index].nextBrother;
				PrintDataTree(P,index);
			}
		}
	}
	
}
// IS : P terdefinisi
// FS : Mencetak secara level order data dari tree

void PrintTree (Isi_Tree P){
	int i;
	if(IsEmpty(P)){
		printf("Tree Nil\n");
	}else{
		printf("\n\nTree Visualization \n\n");
		printf("%s\n", P[1].info);
		PrintChild(P, 1);
	}
	
}
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditulis ke layar (visualisasi) */

void PrintChild(Isi_Tree P, int index){
	int i, temp = P[index].firstSon;
	
	if(temp != 0){
		do{
			for(i=0;i<P[temp].level-1;i++){
				printf("   ");
			}
			printf("|___");
			printf("%s\n",P[temp].info);
			
			if(P[temp].firstSon != 0){
				PrintChild(P, temp);
			}
			temp = P[temp].nextBrother;
		}while(temp != 0);
	}
}
// IS : P Terdefinisi
// FS : Mencetak tiap node dengan bentuk yang akan di visualisasikan

/***** Search *****/

boolean Search (Isi_Tree P, infotype X){
	int i;
	for(i=0;i<jml_maks;i++){
		if(P[i].info == X){
			return 1;
			break;
		}
	}
}
/* Mengirimkan true jika ada node dari P yang bernilai X */


/***** Fungsi Lain *****/

int nbElmt (Isi_Tree P){
	int count = 1;
	if(IsEmpty(P)){
		return 0;
	}else{
		while(strcmp(P[count].info, " ")!= 0){
		count++;
		}
		/*while(P[count].info != " "){
			count++;
		}*/
		return count-1;
	}
}
/* Mengirimkan banyak elemen (node) di pohon non biner P */

int nbDaun (Isi_Tree P, int Maks_node){
	int i, count = 0;
	if(IsEmpty(P)){
		return 0;
	}else{
		for(i=1;i<=Maks_node;i++){
			if(P[i].firstSon == 0){
				count++;
			}
		}
		return count;
	}
}
/* Mengirimkan banyak daun (node) pohon non biner P */

int Level (Isi_Tree P, infotype X){
	int i, count =0;
	if(IsEmpty(P)){
		printf("Nil\n");
	}else{
		for(i=0;i<jml_maks;i++){
			if (strcmp(P[i].info, X) == 0){
				count = i;
				break;
			}
			/*
			if(P[i].info == X){
				count = i;
				break;
			}*/
		}
	}
	while(strcmp(P[count].info, " ")!= 0){
		count++;
		}
	if(count != 0){
		printf("%s Level : %d", X, P[count].level);
	}else
		printf("There is no node with %s info", X);
}
/* Mengirimkan level dari node X yang merupakan salah satu simpul */ 
/* dr pohon P. Akar (P) levelnya adalah 0. Pohon tidak kosong */

int Depth (Isi_Tree P){
	int i, deep;
	if(IsEmpty(P)){
		return -1;
	}else{
		deep = P[1].level;
		for(i=1;i<20;i++){
			deep = Max(P[i].level, deep);
		}
		return deep;
	}
}
/* Pohon Biner mungkin Kosong, mengirimkan 'depth' yaitu tinggi dari Pohon */
/* Basis : Pohon Kosong, tingginya Nol */

int Max (int Data1, int Data2){
	int mac;
	if(Data1 >= Data2){
		return Data1;
	}else return Data2;
}
/* Mengirimkan Nilai terbesar dari dua data */
