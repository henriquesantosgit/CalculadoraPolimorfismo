package br.edu.fatecpg.sobrecarga.model;

public class Calculadora {
	public int somar(int a,int b) {
		return a+b;
	}
	//sobrecarga
	public int somar(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
	//sobrecarga
	public double somar(double a,double b) {
		return a+b;
	}
	
}