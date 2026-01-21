package com.danielblanco.algoritmosestructuras.arraysstringshashtables._01_is_unique;

import java.util.HashSet;
import java.util.Set;

/*
 * Dado un método que recibe una String, comprobar si todos los caracteres son únicos o no.
 *
 * isUnique("abcde") => true;
 * isUnique("abcded") => false;
 */
public class IsUnique {

  public boolean isUnique(String s) {
    Set<Character> charsSet = new HashSet<>();
    char[] charsArray = s.toCharArray();

    for (char c : charsArray) {
        if (charsSet.contains(c)){
          return false;
        }
        charsSet.add(c);
    }

    return charsSet.size() == charsArray.length;
  }
}
