/*
	Name: Implementasi Header nbtrees.h
	Author: Dzakira Fabillah
	Description: 
		Merupakan implementasi dari nbtrees.h
*/
#include "boolean.h"
#include "nbtrees.h"

/* Indeks dalam bahasa C dimulai dengan 0; tetapi indeks 0 tidak dipakai */

/***************************/
/*  I M P L E M E N T A S I  */
/***************************/

address Alokasi(infotype x[50]){
	address p;
	p=(address)malloc(sizeof(nbtree));
	if(p!=NULL){
		strcpy(p->info,x);//p->info diisi dengan string x
		p->ps_fs=NULL;//semua pointer mengarah ke NULL
		p->ps_nb=NULL;
		p->ps_pr=NULL;
		p->level=-1;
	}
	return p;
}


void createEmptyTree(Isi_Tree *X){
	/*Root mengarah ke null ketika tree kosong*/
	X->ROOT=NULL;
}


void Create_tree(Isi_Tree *X){
	char huruf[50]; //menampung string
	address temp;

	/*INPUT Node ROOT*/
	printf("Masukan Node ROOT (Kedudukan Tertinggi di Organisasi/Lembaga) : "); fflush(stdin);
	gets(huruf);
	temp=Alokasi(huruf);
	
	/*Memanggil prosedur insertChild*/
	X->ROOT=temp; //temp dijadika ROOT dari tree tersebut
	X->ROOT->level=0; //  level root = 0
	X->depth=0; 
	InsertChild(X, temp);
	
}


void InsertChild(Isi_Tree *X, address P){
	char huruf[50]; //menampung nama jabatan/lembaga
	int anak,i; //var anak menampung jumlah anak, i untuk perulangan
	address tempInd, baru, last; //tempInd untuk emnampung first son dari P,baru emnampung nbtree baru, 
	                             // last untuk menampung anak dari P (dari fs sampaiseluruh anaknya
	
	printf("Jumlah jabatan/lembaga yang dinaungi %s : ", P->info);
	fflush(stdin);
	scanf("%d", &anak);	
	
	/*Jika jumlah anak == 0 , maka node tsb akan menjadi elaf/daun*/
	if(anak==0){
		printf("  Node akan menjadi daun\n");
	}
	/*Jika jumlah anak != 0 */
	else {
		for(i=0;i<anak;i++){
			/*Menginput masing masing anak node*/
			printf("  anak ke-%d : ", i+1); fflush(stdin);
			gets(huruf);
			baru=Alokasi(huruf);
			baru->ps_pr=P; //parent dari node last adalah P
			/*Anak pertama*/
			if(i==0){
				P->ps_fs=baru; //jadi elemen first son P
				baru->level=baru->ps_pr->level+1; //level nya adalah +1 dari parent nya
				if(baru->level>X->depth){
					X->depth=baru->level;	
				}
			/*Anak ke 2 dst*/
			}else{ 
			    //menjadi next brother dari elemen sebelumnya
				last=P->ps_fs;
				while(last->ps_nb!=NULL){
					last=last->ps_nb;
				}
				last->ps_nb=baru;
				baru->level=last->level;
			}
		}
	}
		/*Rekursif : memanggil prosedur ini kembali untuk setiap anaknya yang tadi diinput*/
		tempInd=P->ps_fs;
		while(tempInd!=NULL){
			/*REKURSIF*/
			InsertChild(X,tempInd);
			tempInd=tempInd->ps_nb;
		}	
}


boolean IsEmpty (Isi_Tree P){
/* Mengirimkan true jika Isi_Tree KOSONG */
	if(P.ROOT==NULL){
		return true;
	}else return false;
}


/***** Traversal *****/

void PreOrder (Isi_Tree P, address index){
	/*Parent, fs, nb */
	if(IsEmpty(P)){
		printf("Tree Kosong\n");
	}else {
		/*PRINT*/
		printf("  %s  \n",index->info);
		/*Jika punya anak, maka akses anak anak nya*/
		if(index->ps_fs!=NULL){
			index=index->ps_fs;
			/*REKURSIF*/
			PreOrder(P,index);
			/*Untuk anak ke-2, dst*/
			while(index->ps_nb!=NULL){
				index=index->ps_nb;
				/*REKURSIF*/
				PreOrder(P,index);
			}
		}
	}	
}


void PostOrder (Isi_Tree P, address index){
	/*fs, nb, Parent */
	address temp=index;
	if(IsEmpty(P)){
		printf("Tree Kosong\n");
	}else {
		/*Mengunjungi anak anak nya terlebih dahulu*/
		if(index->ps_fs!=NULL){
			index=index->ps_fs;
			PostOrder(P,index);
			/*Untuk anak ke-2 dst*/
			while(index->ps_nb!=0){
				index=index->ps_nb;
				PostOrder(P,index);
			}
		}
		/*print parent*/
		printf("  %s  \n",temp->info);		
	}
}


void InOrder (Isi_Tree P, address index){
	/* fs, Parent, Sisa anak lain*/
	address idx=index;
	if(IsEmpty(P)){
		printf("Tree Kosong\n");
	}else {
		if(idx->ps_fs!=0){//jika punya anak, akses first sonnya terlebih dahulu
			idx=idx->ps_fs;
			InOrder(P,idx);
			/*print parent nya*/
			printf("  %s  \n",index->info);
			/*Akses anak anak lain nya selain first son*/
			while(idx->ps_nb!=0){
				idx=idx->ps_nb;
				InOrder(P,idx);
			}
		}else{//apabila tidak punya anak
			printf("  %s  \n",idx->info);
		}
	}	 
}


void Level_order(Isi_Tree P, address index, Isi_Tree *TempLO){ 
	/* Isi_Tree *TempLO adalah tree namun sebenernya bentuk nya seperti queue.
	first son dari node nya bukan lah first son yg sebnarnya, melainkan fungsinya sepertinya 
	pointer next pada ADT queue, dan parents nya seperti previous pada ADT queue.
	urutannya yaitu berdasarkan level, karen atujuannya adalah traversal level order*/
	address temp;
	/*temp menampung elemen yang akan masuk ke tree TempLO*/
	temp=Alokasi(index->info);
	temp->level=index->level;
	/*Bentuk traversalnya sebenarnya menggunakan post order, namun nbtree tidak di print,
	  melainkan di insert di tree TempLO*/
	if(IsEmpty(P)){
		printf("Tree Kosong\n");
	}else {
		if(index->ps_fs!=NULL){
			index=index->ps_fs;
			Level_order(P,index, &(*TempLO));
			while(index->ps_nb!=0){
				index=index->ps_nb;
				Level_order(P,index, &(*TempLO));
			}
		}
		/*Insert di TempLO*/
		if(IsEmpty(*TempLO)){//jika kosong, maka menjadi root
			TempLO->ROOT=temp;
			temp->ps_fs=NULL;
		}else{//jika tidak kosong maka di elemen paling terakhir
			/*cari last*/
			address last = TempLO->ROOT;
				
			while(last->ps_fs!=NULL){
				last=last->ps_fs;
			}
			last->ps_fs=temp;
			temp->ps_pr=last;
			temp->ps_fs=NULL;
			/*Di sorting setiap selesai insert agar terurut ascendign berdasarkan level*/
			Sort(&(*TempLO));
		}
			
	}
}


void printLevelOrder(Isi_Tree P){
	Isi_Tree TempLO;
	createEmptyTree(&TempLO);
	if(IsEmpty(P)){
		printf("Tree Kosong\n");
	}else{
		/*Memanggil prosedur level Order*/
		Level_order(P, P.ROOT, &TempLO);
		/*Print Hasil Traversal Level Order*/
		address root = TempLO.ROOT;
		while(root!=NULL){
			printf("  %s\n", root->info);
			root=root->ps_fs;
		}
		/*Tree TempLO di reset*/
		createEmptyTree(&TempLO);
	}
}


void PrintTree (Isi_Tree P){
	int i;

	if(IsEmpty(P)){
		printf("Tree Kosong\n");
	}else {
		/*Print root kemudian anak anak nya*/
		printf("%s\n",P.ROOT->info );
		printChild(P, P.ROOT);
	}	
}


void printChild(Isi_Tree P, address index){
	address temp=index->ps_fs;
	int i;
	
		while(temp!=NULL){
			/*print spasi dengan perulangan sejumlah tingginya 
		    level akar tree mudah dipahami secara visual*/
			for(i=0;i<temp->level-1;i++){
				printf("   ");
			}
			printf(" |\n");
			for(i=0;i<temp->level-1;i++){
				printf("   ");
			}
			printf(" |__");
			printf("%s\n",temp->info);
			
			/*Akses, print first son*/
			if(temp->ps_fs!=0){
				printChild(P,temp);//rekursif
			}
			/*akses, print anak anak lainnya*/
			temp=temp->ps_nb;
		}
}


/***** Search *****/

boolean Search (Isi_Tree P, address index, infotype X[50]){
	/*Mencari apakah dalam Tree ada yang nilai node nya X*/
	infotype temp[50];
	int i;
	boolean find;
	strcpy(temp,index->info);
	if(IsEmpty(P)){
		find = false;
	}else {
		/*agar incase sensitive, menggunakan fungsi tolower*/
		for(i=0;i<=strlen(temp);i++){
			temp[i]=tolower(temp[i]);
		}
		for(i=0;i<=strlen(X);i++){
			X[i]=tolower(X[i]);
		}
		if(strcmp(temp,X)==0){	//jika ditemukan
			find=true;
		}
		if(find==false && index->ps_fs!=NULL){//jika belum di temukan
			index=index->ps_fs; //cari di first son
			find=Search(P, index, X); 
			while(find==false && index->ps_nb!=NULL){ //akses dan cari ke anak anak lain
				index=index->ps_nb;
				find=Search(P, index, X);
			}
		}
	}
	return find;
}


address SearchElmnt (Isi_Tree P, address index, infotype X[50]){
	infotype tempInfo[50];
	int i;
	strcpy(tempInfo,index->info);
	address find=NULL;
	//printf("2  ");
	address temp;
	//printf("3  ");
	for(i=0;i<=strlen(X);i++){
			X[i]=tolower(X[i]);
	}
	for(i=0;i<=strlen(tempInfo);i++){
			tempInfo[i]=tolower(tempInfo[i]);
	}
	if(IsEmpty(P)){
		find = NULL;
	}else {
	//	printf("4  ");
		if(strcmp(tempInfo,X)==0){//apabila ditemukan
	//		printf("0"  );
			return index;
		}else if(index->ps_fs!=NULL&&find==NULL){//coba cari anak - anaknya
	//		printf("1  ");
			index=index->ps_fs;
			find=SearchElmnt(P, index, X);
			while(find==NULL && index->ps_nb!=NULL){
				index=index->ps_nb;
				find=SearchElmnt(P, index, X);
			}
		}
	}
	if(find==NULL){
		return NULL;
	}
}

/***** Fungsi Lain *****/

int nbElmt (Isi_Tree P, address index){
	int count=0;
	if(IsEmpty(P)){
		return 0;
	}else {
		/*Dengan Cara PreOrder*/
		count++;
		if(index->ps_fs!=NULL){
			index=index->ps_fs;
			count=count+nbElmt(P,index);
			while(index->ps_nb!=NULL){
				index=index->ps_nb;
				count=count+nbElmt(P,index);
			}
		}
		//return jumlah elemen tree
		return count;
	}	
}


int nbDaun (Isi_Tree P, address index){
	int count=0;
	if(IsEmpty(P)){
		return 0;
	}else {
		/*Dengan Cara PreOrder*/
		/*didefinisikan sbg daun apabila tidak memiliki anak, ps_fs mengarah ke 0*/
		if(index->ps_fs==NULL){
			count++;	
		}
		if(index->ps_fs!=NULL){
			index=index->ps_fs;
			count=count+nbDaun(P,index);//rekursif
			while(index->ps_nb!=NULL){
				index=index->ps_nb;
				count=count+nbDaun(P,index);//rekursif
			}
		}
		return count;
	}	
}


int Level (Isi_Tree P, infotype X[50]){
	address cari;
	if(IsEmpty(P)){
		printf("Tree Kosong\n");
		return -1;
	}else{
		if(Search(P,P.ROOT,X)){//jika ada nbtree dengan nilai info == X
			/*Mencari elemen dengan nilai X*/
			cari=SearchElmnt(P,P.ROOT,X);
			return cari->level;
		}else {//apabila tidak ada
			return -1;	
		}	
	}
}


int Depth (Isi_Tree P){
	int i, max;
	if(IsEmpty(P)){
		return -1;
	}else{//print depth
		return P.depth;
	}
}


int Max (infotype Data1, infotype Data2){
	int max;
	if(Data1>=Data2){
		return Data1;
	}else return Data2;
}


void swap(address A, address B){
	nbtree tempA,tempB;
	/*SWAPPING*/
	
	strcpy(tempA.info,A->info); //megncopy isi string
	tempA.level = A->level;//mengcopy isi level
	
	strcpy(tempB.info,B->info);//megncopy isi string
	tempB.level = B->level;//mengcopy isi level
	
	strcpy(A->info,tempB.info);//megncopy isi string
	A->level = tempB.level;//mengcopy isi level
	
	strcpy(B->info,tempA.info);//mengcopy isi string
	B->level = tempA.level;//mengcopy isi level
}


/*Prosedur Untung urut ASCENDING berdasarkan level*/
void Sort(Isi_Tree *L){
	int swapped, i;
	address ptr1;//menampung alamat struct mahasiswa
	do{
		swapped =0;
		ptr1= L->ROOT;
		while(ptr1->ps_fs != NULL){
			if(ptr1->level>ptr1->ps_fs->level){ //jika level elemen lebih tinggi dari elemen selanjutnya(first son nya), maka dilakukan swapping
				swap(ptr1,ptr1->ps_fs);//memanggil prosedur swap
				swapped=1;
			}
			ptr1=ptr1->ps_fs;//ptr menunjuk elemen selanjutnya / first son nya
		}
	}
	while (swapped);
}


