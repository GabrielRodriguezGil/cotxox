package edu.teamrocket.carrera;

import java.util.Optional;
import edu.teamrocket.conductores.*;

public class Carrera {
    private String tarjetCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperado;
    private int tiempoCarrera;
    private double costeTotal;
    private int propina;
    private Optional<Conductor> conductor;

    public Carrera(String tarjetaCredito) {
        this.tarjetCredito = tarjetaCredito;
    }

    public String getTarjetCredito() {
        return tarjetCredito;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public void realizarPago(double pago) {
        this.costeTotal = pago;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public int getPropina() {
        return propina;
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = Optional.ofNullable(conductor);
    }

    public Conductor getConductor() {
        return this.conductor.get();
    }

}