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
		X[i].info= ' ';
		X[i].firstSon = 0;
		X[i].nextBrother = 0;
		X[i].parent = 0;
		X[i].level = -1;
	}
	
	//Masukan jumlah node dan menginputkan Root
	if(Jml_Node > 20){
		printf("Over Capacity (MAX = 20)\n");
	}else{
		printf("Input node Root : "); fflush(stdin); scanf("%c",&alpha);
		X[1].info = alpha;
		X[1].level = 0;
		Insert(X, Jml_Node, 1);
	}
}
// Create Non Binary Tree sebanyak Jml_Node
// Tujuan mengentrykan Non Binary Tree ke array Isi_Tree dengan pola Level Order 
// Jml Node adalah banyaknya elemen dalam Tree yang menjadi parameter input

void Insert(Isi_Tree X, int Jml_Node, int index){
	//Melakukan insert Child pada tree setelah insert root
	//Insert akan dilakukan terus menerus sampai memenuhi jumlah yang diinginkan (diinputkan)
	
	
	int last = 1, dot, i, temp = 1;
	//int index = 1;
	int tempIdx;
	
	//Cek tempat kosong
	while(X[last].info != ' '){
		last++;
	}
	
	//input child
	printf("Number of Child %c : ", X[index].info );fflush(stdin);
	scanf("%d", &dot);
	
	//Node akan menjadi daun jika jumlah anak 0
	if(dot == 0){
		printf(" Node turn into a leaf\n"); 
	}else{
		for(i=0;i<dot;i++){
			//X[last].parent = X[temp].info;
			//line untuk input parent
			if(last>Jml_Node){
				printf(" Overflow\n");
				break;
			//Input	
			}else{
				printf(" Child Number %d : ", i+1);fflush(stdin);
				scanf("%c", &X[last].info);
				X[last].parent = index;
				if(i == 0){
					X[index].firstSon = last;
					X[last].level = X[X[last].parent].level+1;
				}else{
					X[last-1].nextBrother = last;
					X[last].level = X[last-1].level;
				}
				last++;
			}
		}
		temp++;
		//line utk temp ++ pengganti last
		tempIdx = X[index].firstSon;
		for(i=0;i<dot;i++){
			if(last <= Jml_Node){
				Insert(X, Jml_Node, tempIdx);
				tempIdx++;
			}
		}
	}
}

boolean IsEmpty (Isi_Tree P){
	if(P[1].info == ' '){
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
		printf("%c ",P[index].info);
		//Cek anak, jika punya maka akan di akses begitu seterusnya
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
			printf("%c ",P[index].info);
			while(P[idx].nextBrother != 0){
				idx = P[idx].nextBrother;
				InOrder(P,idx);
			}
		}else{
			printf("%c ",P[idx].info);
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
		printf("%c ",P[temp].info);
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
					printf("%c ", X[i].info);
				}
			}
		}
	}
}
/* Traversal LevelOrder */
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditampilkan secara preorder */

void PrintNode (Isi_Tree P, int index){
	printf("\n\nData : %c\n",P[index].info);
	printf("Parent : %c\n",P[index].parent);
	printf("First Son : %c\n",P[index].firstSon);
	printf("Next Brother : %c\n\n",P[index].nextBrother);
}
// IS : P terdefinisi
// FS : Mencetak data lengkap dari sebuah node

void PrintDataTree (Isi_Tree P, int index){
	if(IsEmpty(P)){
		printf("Nil\n");
	}else{
		PrintNode(P, index);
		//printf("%c ",P[index].info);
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
	/*int lvl = Depth(P);
	int i, j;
	if(IsEmpty(P)){
		printf("Nil\n");
	}else{
		for(j=0;j<=lvl;j++){
			for(i=1;i<=index;i++){
				if(P[i].level == j){
					PrintNode(P, i);
				}
			}
		}
	}*/
}
// IS : P terdefinisi
// FS : Mencetak secara level order data dari tree

void PrintTree (Isi_Tree P){
	int i;
	if(IsEmpty(P)){
		printf("Tree Nil\n");
	}else{
		printf("Tree Visualization \n");
		printf("%c\n", P[1].info);
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
			printf("___");
			printf("%c\n",P[temp].info);
			
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
/* Mengirimkan true jika ada node dari P yang bernilai X *


/***** Fungsi Lain *****/

int nbElmt (Isi_Tree P){
	int count = 1;
	if(IsEmpty(P)){
		return 0;
	}else{
		while(P[count].info != ' '){
			count++;
		}
		return count-1;
	}
}
/* Mengirimkan banyak elemen (node) di pohon non biner P */

int nbDaun (Isi_Tree P, int Maks_node){
	int i, count = 0;
	if(IsEmpty(P)){
		return 0;
	}else{
		for(i=0;i<Maks_node;i++){
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
			if(P[i].info == X){
				count = i;
				break;
			}
		}
	}
	if(count != 0){
		printf("%c is at level %d", X, P[count].level);
	}else
		printf("There is no node with %c info", X);
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

int Max (infotype Data1, infotype Data2){
	int mac;
	if(Data1 >= Data2){
		return Data1;
	}else return Data2;
}
/* Mengirimkan Nilai terbesar dari dua data */
