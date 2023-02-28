/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Gustavo Camargo
 */
public class JogoDaVelha {
    
    public int[][] mat = new int[3][3];
    
 
    public int[][] criaMatriz() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = 0;
            }
        }
        return mat;
    }
    public int getValor(int i, int j) {
        return mat[i][j];
    }
    
    public int setValor ( int i , int j, int valor) {       
        mat[i][j] = valor;
        return mat[i][j];    
    }
    
    public void imprimeMat(){
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat1[j]);
            }
            System.out.println();
        }
    }
    
    public boolean verificaVitoria(int i, int j) {
        String linha = "";
        for(int x = 0; x < mat.length; x++){
            linha = linha + getValor(i, x);
        }
        System.out.println(linha);
        if(linha.contains("111") || linha.contains("222")){
            System.out.println(linha);
            return true;
        }else {
            
            String coluna = "";
            for(int x = 0; x < mat.length; x++){
                coluna = coluna + getValor(x, j);
            }
            System.out.println(coluna);
            return coluna.contains("111") || coluna.contains("222");
        }
    }

}
