package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static String message = "Bonjour!";

    public static void main(String[] args) {
        System.out.println(message);
        int result = divide(10, 0); // Erreur : Division par zéro
        System.out.println("Résultat : " + result);
    }

    public static int divide(int a, int b) {
        return a / b; // Erreur potentielle si b = 0
    }

    public void neverUsedMethod() {
        // Cette méthode n'est jamais utilisée
    }
}
