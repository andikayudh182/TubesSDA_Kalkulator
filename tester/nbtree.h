#ifndef nbtree_h
#define nbtree_h

#include "boolean.h"
#include <stdio.h>
#include <string.h>

//Maksimal node yang dapat ditampung dalam array
#define jml_maks 20

//Arah traversal

/*
#define kebawah  1
#define keatas   2
#define kekanan  3
#define nil	  0


/***************************/
/*  Type data */
/***************************/

/* Indeks dalam bahasa C dimulai dengan 0; tetapi indeks 0 tidak dipakai */

/* Kamus */

typedef char infotype[25];
typedef int address;
typedef struct{
	infotype info; //Variabel yang akan berisikan nama utama dari tree
	infotype couple; //Variabel berisi nama pasangan dari info
	address firstSon; 
	address nextBrother;
	address parent;
	int level; //Cek levelling pada tree
}nbtree;

typedef nbtree Isi_Tree[jml_maks+1];



/***************************/
/*  S P E S I F I K A S I  */
/***************************/


void Create_tree(Isi_Tree X, int Jml_Node);
// Create Non Binary Tree sebanyak Jml_Node
// Tujuan mengentrykan Non Binary Tree ke array Isi_Tree dengan pola Level Order 
// Jml Node adalah banyaknya elemen dalam Tree yang menjadi parameter input

void Insert(Isi_Tree X, int Jml_Node, int index);
	//Melakukan insert Child pada tree setelah insert root
	//Insert akan dilakukan terus menerus sampai memenuhi jumlah yang diinginkan (diinputkan)


boolean IsEmpty (Isi_Tree P);
/* Mengirimkan true jika Isi_Tree KOSONG */



/***** Traversal *****/

void PreOrder (Isi_Tree P, int index);
/* Traversal PreOrder */
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditampilkan secara PreOrder : Parent, fs, nb */

void InOrder (Isi_Tree P,int index);
/* Traversal InOrder */
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditampilkan secara InOrder : fs, Parent, Sisa anak lain */

void PostOrder (Isi_Tree P,int index);
/* Traversal PostOrder */
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditampilkan secara PostOrder :  fs, nb, Parent */

void Level_order(Isi_Tree X, int Maks_node);
/* Traversal LevelOrder */
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditampilkan secara Level Order */

void PrintNode (Isi_Tree P, int index);
// IS : P terdefinisi
// FS : Mencetak data lengkap dari sebuah node

void PrintDataTree (Isi_Tree P, int index);
// IS : P terdefinisi
// FS : Mencetak secara level order data dari tree

void PrintTree (Isi_Tree P);
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditulis ke layar */

void PrintChild(Isi_Tree P, int index);
// IS : P Terdefinisi
// FS : Mencetak tiap node dengan bentuk yang akan di visualisasikan




/***** Search *****/

boolean Search (Isi_Tree P, infotype X);
/* Mengirimkan true jika ada node dari P yang bernilai X *


/***** Fungsi Lain *****/

int nbElmt (Isi_Tree P);
/* Mengirimkan banyak elemen (node) di pohon non biner P */

int nbDaun (Isi_Tree P,int Maks_node);
/* Mengirimkan banyak daun (node) pohon non biner P */

int Level (Isi_Tree P, infotype X);
/* Mengirimkan level dari node X yang merupakan salah satu simpul */ 
/* dr pohon P. Akar (P) levelnya adalah 0. Pohon tidak kosong */

int Depth (Isi_Tree P);
/* Pohon Biner mungkin Kosong, mengirimkan 'depth' yaitu tinggi dari Pohon */
/* Basis : Pohon Kosong, tingginya Nol */

int Max (int Data1, int Data2);
/* Mengirimkan Nilai terbesar dari dua data */


#endif

