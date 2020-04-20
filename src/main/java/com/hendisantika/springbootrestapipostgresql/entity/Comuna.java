package com.hendisantika.springbootrestapipostgresql.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Comuna {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
 /*   private Long id;
    private String name;
    private String description;
    private String status;
    private Long day;
    private String url;*/
    private Long local_id;
    private String local_nombre;
    private String comuna_nombre;
    private String localidad_nombre;
    private String local_direccion;
    private String funcionamiento_hora_apertura;
    private String funcionamiento_hora_cierre;
    private Long local_telefono;
    private String local_lat;
    private String local_lng;
    private String funcionamiento_dia;
    private Long fk_region;
    private Long fk_comuna;
    private Date fecha;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "tienda")
    @Column(name = "detallesTienda")
    private List<String> tienda = new ArrayList<>();


    public Comuna(String local_nombre, String comuna_nombre, List<String> tienda) {
        this.local_nombre = local_nombre;
        this.comuna_nombre = comuna_nombre;
        this.tienda = tienda;
    }

    public Comuna() {
    }

  /*  public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public List<String> getClimas() {
        return climas;
    }

    public void setClimas(List<String> climas) {
        this.climas = climas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getDay() {
        return day;
    }

    public void setDay(Long day) {
        this.day = day;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }*/

    public Long getLocal_id() {
        return local_id;
    }

    public void setLocal_id(Long local_id) {
        this.local_id = local_id;
    }

    public String getLocal_nombre() {
        return local_nombre;
    }

    public void setLocal_nombre(String local_nombre) {
        this.local_nombre = local_nombre;
    }

    public String getComuna_nombre() {
        return comuna_nombre;
    }

    public void setComuna_nombre(String comuna_nombre) {
        this.comuna_nombre = comuna_nombre;
    }

    public String getLocalidad_nombre() {
        return localidad_nombre;
    }

    public void setLocalidad_nombre(String localidad_nombre) {
        this.localidad_nombre = localidad_nombre;
    }

    public String getLocal_direccion() {
        return local_direccion;
    }

    public void setLocal_direccion(String local_direccion) {
        this.local_direccion = local_direccion;
    }

    public String getFuncionamiento_hora_apertura() {
        return funcionamiento_hora_apertura;
    }

    public void setFuncionamiento_hora_apertura(String funcionamiento_hora_apertura) {
        this.funcionamiento_hora_apertura = funcionamiento_hora_apertura;
    }

    public String getFuncionamiento_hora_cierre() {
        return funcionamiento_hora_cierre;
    }

    public void setFuncionamiento_hora_cierre(String funcionamiento_hora_cierre) {
        this.funcionamiento_hora_cierre = funcionamiento_hora_cierre;
    }

    public Long getLocal_telefono() {
        return local_telefono;
    }

    public void setLocal_telefono(Long local_telefono) {
        this.local_telefono = local_telefono;
    }

    public String getLocal_lat() {
        return local_lat;
    }

    public void setLocal_lat(String local_lat) {
        this.local_lat = local_lat;
    }

    public String getLocal_lng() {
        return local_lng;
    }

    public void setLocal_lng(String local_lng) {
        this.local_lng = local_lng;
    }

    public String getFuncionamiento_dia() {
        return funcionamiento_dia;
    }

    public void setFuncionamiento_dia(String funcionamiento_dia) {
        this.funcionamiento_dia = funcionamiento_dia;
    }

    public Long getFk_region() {
        return fk_region;
    }

    public void setFk_region(Long fk_region) {
        this.fk_region = fk_region;
    }

    public Long getFk_comuna() {
        return fk_comuna;
    }

    public void setFk_comuna(Long fk_comuna) {
        this.fk_comuna = fk_comuna;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<String> getTienda() {
        return tienda;
    }

    public void setTienda(List<String> tienda) {
        this.tienda = tienda;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "local_id=" + local_id +
                "local_nombre=" + local_nombre +
                ", comuna_nombre='" + comuna_nombre + '\'' +
                ", localidad_nombre='" + localidad_nombre + '\'' +
                ", local_direccion='" + local_direccion + '\'' +
                ", funcionamiento_hora_apertura='" + funcionamiento_hora_apertura + '\'' +
                ", funcionamiento_hora_cierre=" + funcionamiento_hora_cierre +
                ", local_telefono=" + local_telefono +
                ", funcionamiento_dia=" + funcionamiento_dia +
                ", fecha=" + fecha +
                '}';
    }


}
