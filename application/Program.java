package chessSystem.application;

import java.util.Scanner;

import chessSystem.entities.Position;

public class Program {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Position pos = new Position(3, 5);
		System.out.println(pos);
	}
}