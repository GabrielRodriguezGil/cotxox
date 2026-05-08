package edu.teamrocket.conductores;

import java.util.List;
import java.util.ArrayList;

public class Conductor {
    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia = 0d;
    private boolean ocupado = false;
    private List<Byte> valoraciones = new ArrayList<>();

    Conductor() {

    }

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {
        return valoracionMedia;
    }

    private Double calcularValoracionMedia() {
        return valoraciones.stream().mapToDouble(Byte::doubleValue).average().getAsDouble();

    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
        this.valoracionMedia = calcularValoracionMedia();
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getNumeroValoraciones() {
        return valoraciones.size();
    }

}