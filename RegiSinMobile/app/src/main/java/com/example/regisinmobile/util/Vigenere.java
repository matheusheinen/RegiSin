package com.example.regisinmobile.util;

public final class Vigenere {

    char[] mensagem;
    char[] chave;
    char[] resultado;
    char matriz[][];
    char[] texto;

    //Cria um array de characteres com 96 posições
    public char[] gerarAlfabeto() {
        char[] abc = new char[96];

        for (int i = 32; i <= 127; i++) {
            abc[i - 32] = (char) i;
        }
        return abc;
    }

    public char[][] gerarMatriz() {
        int contador;
        char abcTemp[] = gerarAlfabeto();
        char abc[] = new char[abcTemp.length * 2];

        for (int c = 0; c < 96; c++) {
            abc[c] = abcTemp[c];
            abc[c + 96] = abcTemp[c];
        }

        char[][] wMatriz = new char[96][96];

        for (int i = 0; i < 96; i++) {
            contador = 0;

            for (int j = 0; j < 96; j++) {
                wMatriz[i][j] = abc[contador + i];
                contador++;
            }
        }
        return wMatriz;
    }

    public Vigenere(String chave, String msg) {
        this.mensagem = msg.toCharArray();
        char[] chaveTemp = chave.toCharArray();
        this.chave = new char[msg.length()];
        int cont = 0;

        for (int i = 0; i < msg.length(); i++) {
            this.chave[i] = chaveTemp[cont];
            cont++;
            if (cont == chaveTemp.length) {
                cont = 0;
            }
        }

        this.matriz = gerarMatriz();
    }

    public String encriptar() {

        char[] cifrado = new char[mensagem.length];
        String retorno = "";
        int x, y;

        for (int cont = 0; cont < mensagem.length; cont++) {
            x = (int) this.mensagem[cont] - 32;
            y = (int) this.chave[cont] - 32;
            cifrado[cont] = this.matriz[x][y];
        }
        this.resultado = cifrado;

        System.out.println(this.mensagem);
        System.out.println(this.chave);
        System.out.println(cifrado);

        for (int i = 0; i < cifrado.length; i++) {
            retorno += cifrado[i];
        }

        for (int k = 0; k < 96; k++) {
            System.out.println(this.matriz[k]);
        }

        return retorno;
    }

    public String decriptar() {
        char[] decifrado = new char[mensagem.length];
        String retorno = "";
        int y;

        for (int cont = 0; cont < mensagem.length; cont++) {
            y = (int) this.chave[cont] - 32;

            char[] coluna = new char[96];

            for (int i = 0; i < 96; i++) {
                coluna[i] = this.matriz[i][y];
            }

            int a = 0;
            boolean teste = false;
            do {
                if (coluna[a] == mensagem[cont]) {
                    break;
                }
                a++;
            } while (teste == false);

            decifrado[cont] = this.matriz[a][0];

        }

        for (int i = 0; i < decifrado.length; i++) {
            retorno += decifrado[i];
        }

        System.out.println(this.mensagem);
        System.out.println(this.chave);
        System.out.println(decifrado);

        this.resultado = decifrado;
        return retorno;
    }

}