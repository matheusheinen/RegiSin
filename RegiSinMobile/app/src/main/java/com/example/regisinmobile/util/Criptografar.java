package com.example.regisinmobile.util;

import java.text.Normalizer;

public class Criptografar {

    public static String retirarAcento(String str) {
        str = Normalizer.normalize(str, Normalizer.Form.NFD);
        str = str.replaceAll("[^\\p{ASCII}]", "");
        return str;
    }

}