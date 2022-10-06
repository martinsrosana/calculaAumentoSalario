package entidades;

public class Listas {
private Integer id;
private String nome;
private Double salario;

public Listas(Integer id, String nome, Double salario) {
	this.id = id;
	this.nome = nome;
	this.salario = salario;
}
public Listas(String nome, Double salario) {
	this.nome = nome;
	this.salario = salario;
}
public Listas() {

}
public Integer getId() {
	return id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Double getSalario() {
	return salario;
}
public void setSalario(Double salario) {
	this.salario = salario;
}
public void aumentoSalario(double porcentagem) {
	salario += salario * porcentagem /100;
}
@Override
public String toString() {
	return id + ", " + nome + ", " + String.format("%.2f", salario);
}

}
