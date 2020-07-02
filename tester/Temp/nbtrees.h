/*
	Name: Header NBTREE
	Author: Bapak Ade Chandra (dengan sedikit perubahan yg disesuaikan dengan kebutuhan)
			di modifikasi oleh : Dzakira F (191524040)
	Description: 
		Merupakan Header dari program implementasi tree terhadap organigram organisasi/lemabaga.
		Menggunakan alokasi dinamis.
*/
#ifndef nbtrees_h
#define nbtrees_h

#include "boolean.h"
//Maksimal node yang dapat ditampung dalam array
#define jml_maks 21
#include <stdio.h>
#include <string.h>

/***************************/
/*  Type data */
/***************************/

/* Kamus */

typedef char infotype; 
typedef struct nbtree *address; //pointer yg berisikan alamat nbtree
typedef struct nbtree { 
	infotype info[50];//menampung nama jabatan/lembaga/apa saja yang merupakan bagian dari organigram
   	address ps_fs, ps_nb, ps_pr;//pointer yang menyimpan alamat first son, parent, dan next brother.
   	int level; //nilai tingkatan level dari suatu node
}nbtree;

typedef struct{
	address ROOT; //menampung ROOT dari TREE
	int depth; //kedalaman dari tree
}Isi_Tree;



/***************************/
/*  S P E S I F I K A S I  */
/***************************/

void createEmptyTree(Isi_Tree *X);
//Tujuan : Membuat Tree kosong
//pointer ROOT mengarah ke NULL

void Create_tree(Isi_Tree *X);
// Create Non Binary Tree sebanyak Jml_Node
// Tujuan mengentrykan Non Binary Tree ke array Isi_Tree dengan pola Level Order 
// Jml Node adalah banyaknya elemen dalam Tree yang menjadi parameter input

void InsertChild(Isi_Tree *X, address P);
//dipanggil dalam void InsertChild
//prosedur untuk insert anak anak dari sebuah nbtree
//dimulai dari mengisi pointer first son nya
//anak ke 2, dst akan menjadi next brother dari first son nya

boolean IsEmpty (Isi_Tree P);
/* Mengirimkan true jika Isi_Tree KOSONG */



/***** Traversal *****/

void PreOrder (Isi_Tree P, address index);
/* Traversal PreOrder */
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditampilkan secara PreOrder : Parent, fs, nb */

void InOrder (Isi_Tree P, address index);
/* Traversal InOrder */
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditampilkan secara InOrder : fs, Parent, Sisa anak lain */

void PostOrder (Isi_Tree P, address index);
/* Traversal PostOrder */
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditampilkan secara PostOrder :  fs, nb, Parent */

void Level_order(Isi_Tree P, address index,Isi_Tree *TempLO);
/* Traversal LevelOrder */
/* IS : P terdefinisi */
/* FS : Semua simpul P disimpan dalam TempLO, ascending sesuai level nya, 
        mengurut secara level order*/

void printLevelOrder(Isi_Tree P);
//akan memanggil prosedur level order
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditampilkan secara Level Order */

/***Prosedur untuk level order****/

void Sort(Isi_Tree *L);
/*Digunakan untuk level order
  nbtree tidak ada yg memiliki next brother
  di urutkan dari root sampai daun dari level terkekcil hingga terbesar*/

void swap(address A, address B);
/*Menukar isi/nilai dari A dan B*/



/********print Visualisasi Tree*********/

void PrintTree(Isi_Tree P);
/* IS : P terdefinisi */
/* FS : Semua simpul P sudah ditulis ke layar */

void printChild(Isi_Tree P, address index);
/* IS : P terdefinisi */
/* FS : Semua anak dari simpul P sudah ditulis ke layar */



/***** Search *****/

boolean Search (Isi_Tree P, address index, infotype X[50]);
/* Mengirimkan true jika ada node dari P yang bernilai X */


address SearchElmnt (Isi_Tree P, address index, infotype X[50]);
//IS : data X ada dalam Tree
//FS : address nbtree yang nilai info nya == x di return
//mengembalikan nilai node dari P yang bernilai X, jika ada */

/***** Fungsi Lain *****/

int nbElmt (Isi_Tree P, address index);
/* Mengirimkan banyak elemen (node) di pohon non biner P */

int nbDaun  (Isi_Tree P, address index);
/* Mengirimkan banyak daun (node) pohon non biner P */

int Level (Isi_Tree P, infotype X[50]);
/* Mengirimkan level dari node X yang merupakan salah satu simpul */ 
/* dr pohon P. Akar (P) levelnya adalah 0. Pohon tidak kosong */

int Depth (Isi_Tree P);
/* Pohon Biner mungkin Kosong, mengirimkan 'depth' yaitu tinggi dari Pohon */
/* Basis : Pohon Kosong, tingginya Nol */

int Max (infotype Data1, infotype Data2);
/* Mengirimkan Nilai terbesar dari dua data */
#endif

