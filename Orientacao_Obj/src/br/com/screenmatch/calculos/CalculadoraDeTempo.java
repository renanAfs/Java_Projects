package br.com.screenmatch.calculos;

import br.com.screenmatch.models.FilmeModel;
import br.com.screenmatch.models.TituloModel;

public class CalculadoraDeTempo {
    private int tempoTotal;
    private String itemName;
    private String itemType;
    private int itemTime;

    public int getTempoTotal() {
        return this.tempoTotal;

    }

    public String getItemName() {
        return itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public int getItemTime() {
        return itemTime;
    }

    public void putInclui(TituloModel titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
        this.itemName = titulo.getNome();
        this.itemType = titulo.getTipo();
        this.itemTime = titulo.getDuracaoEmMinutos();
    }



}
