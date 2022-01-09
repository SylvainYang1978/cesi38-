package com.ceci.yang.tableaux;

import java.lang.*;
import java.util.*;

/*
 EX 02 Rechercher des valeurs communes � deux tableaux 
1)D�finir deux tableaux de 10 �l�ments de type entier et les remplir 
   avec des valeurs aleatoires comprises entre 1 et 10 
2) afficher le contenu de ces deux tableaux �l�ment par �l�ment
3) calculer et afficher le nombre de valeurs communes � ces deux tableaux
4) si une valeur est pr�sente dans les deux tableaux , et qu'elle est aussi
pr�sente plusieurs fois dans l'un ou dans les deux tableaux , elle  n'est compt�e qu'une seule fois 
 */





public class ValeursCommunes {

	// D�claration de la fonction qui affectera des valeurs al�atoires aux �l�ments des deux tableaux
	public static void affecterValeurs(int tab1[] , int tab2[])
	{
		
		// Affectation de valeurs al�atoires pour chaque �l�ments des deux tableaux
		
				for (int i = 0 ; i< tab1.length ;i++)
				{
					int aleat  = (int) (9*Math.random()+1);
					tab1[i]=aleat;
					aleat =(int) (9*Math.random()+1);
					tab2[i]=aleat;
			     }
					
		
	}
	
	// D�claration de la fonction qui affiche les deux tableaux avec leur valeurs
	
	public static void afficherTableaux(int tab1[] , int tab2[])
	{
		System.out.print("Tableaux1 : ");
		for(int i =0 ; i<tab1.length;i++)
		    System.out.print(tab1[i]+"|");
		System.out.println();
		System.out.print("Tableaux2 : ");
		for(int i =0 ; i<tab1.length;i++)
		    System.out.print(tab2[i]+"|");	
		
		
		
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// D�claration des deux tableaux d'entiers
		
		int tableau1 [] = new int[10] ;
		int tableau2 [] = new int[10] ;
		
		//Appel de la fonction affecterValeurs
		
		affecterValeurs(tableau1, tableau2);
		
		// Appel de la focntion afficherTableaux
		
        afficherTableaux(tableau1, tableau2);
        
        
        // 
        /*int occ=0;
        for(int i = 0 ;i< tableau1.length ;i++)
        {
        	for(int j= 0; j<tableau1.length;)
       */ 	
        }
        
	}


