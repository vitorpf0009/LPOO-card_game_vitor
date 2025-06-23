/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author vito
 */
@Table(name = "tbl_jogador")
@Entity
public class Jogador implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "jog_id")
    private int id;
    @Column(name = "jog_nickname", nullable = false)
    private String nickname;
    @Column(name = "jog_level")
    private int level;
    @ElementCollection
    
    
    
    @ManyToMany
    @JoinTable(
        name = "tbl_baralho_jogador",
        joinColumns =  @JoinColumn(name = "jogador"), 
        inverseJoinColumns = @JoinColumn(name = "carta")
        
        )
    
  private List<Carta> baralho;

   public Jogador() {
       baralho = new ArrayList<>();
   }
 
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Carta> getBaralho() {
        return baralho;
    }

    public void getLeve() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    
}
