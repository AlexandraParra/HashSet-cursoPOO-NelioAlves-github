package aplicacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidades.Curso;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set <Curso> set = new HashSet<>();
		int codUsuario = 0;
		System.out.print("Quántos estudantes pertencem ao curso A?");
		int a = sc.nextInt();
		for (int i=1; i<=a; i++) {
			codUsuario = sc.nextInt();
			set.add(new Curso(codUsuario));
		}
		
		System.out.print("Quántos estudantes pertencem ao curso B?");
		int b = sc.nextInt();
		for (int i=1; i<=b; i++) {
			codUsuario = sc.nextInt();
			set.add(new Curso(codUsuario));
		}
		
		System.out.print("Quántos estudantes pertencem ao curso C?");
		int c = sc.nextInt();
		for (int i=1; i<=c; i++) {
			codUsuario = sc.nextInt();
			set.add(new Curso(codUsuario));
		}
		
		System.out.println("Número de estudantes: " + set.size());
		sc.close();

	}

}
