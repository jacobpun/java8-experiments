package org.punnoose.java8lambda;

import static java.util.Arrays.spliterator;
import static java.util.stream.Collectors.joining;
import static java.util.stream.StreamSupport.stream;

public class Swap2ndChar {

    public static void main(String[] args) {
        String sentence = "Ad ut laboris do ut anim. Ex dolore eiusmod qui nostrud elit velit ullamco exercitation. Exercitation fugiat consectetur laboris consequat ut labore pariatur. Ad cillum nulla cillum nisi nulla cupidatat adipisicing aute ipsum dolor exercitation eiusmod amet. Esse eiusmod pariatur non deserunt esse minim laborum aliqua elit excepteur anim. Irure proident duis sunt voluptate ullamco veniam velit Lorem do ut aliquip ipsum consequat tempor. Aliqua sit consequat aute consequat eiusmod ullamco sint magna.";
        String result = stream(spliterator(sentence.split("\\b")), false)
                                .map(Swap2ndChar::swapCharacters)
                                .collect(joining(""));

        System.out.println(result);
    }

    private static String swapCharacters(String word) {
        if (word.length() < 4) {
            return word;
        }

        int secondLastCharIndex = word.length() - 2;
        StringBuilder builder = new StringBuilder(word);
        builder.setCharAt(1, word.charAt(secondLastCharIndex));
        builder.setCharAt(secondLastCharIndex, word.charAt(1));
        return builder.toString();
    }
}