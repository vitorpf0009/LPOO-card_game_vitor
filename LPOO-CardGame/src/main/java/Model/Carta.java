/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import com.sun.istack.Nullable;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author vito
 */

@Entity
@Table(name = "tb_carta")
public class Carta implements Serializable {

      @Id
    @SequenceGenerator(name = "car_id", sequenceName = "car_id", allocationSize = 1)
    @GeneratedValue(generator = "car_id", strategy = GenerationType.SEQUENCE)  
    private int id;
      
   @Column(name = "car_nome" , nullable = false)
    private String nome;
   
   @Column(name = "car_ataque", nullable = false)
    private int ataque;

   @Column(name = "car_defesa", nullable = false)
   private int defesa;
   
      @Column(name = "car_categoria", nullable = true)
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
   
    @Column(name = "car_raridade", nullable = true)
    private int raridade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getRaridade() {
        return raridade;
    }

    public void setRaridade(int raridade) {
        this.raridade = raridade;
    }

 @Override
 public String toString(){
     retutn nome +"(categotia;
 }
    }
