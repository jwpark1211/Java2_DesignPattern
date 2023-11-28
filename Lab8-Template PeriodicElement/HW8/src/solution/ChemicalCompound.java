package solution;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import template.PeriodicElement;
import template.Phase;

public class ChemicalCompound {
    private String name;
    private String symbol;
    private List<Compound> compounds; //구성원소 List
    private Phase phase;

    /* constructor */
    public ChemicalCompound(String name, String symbol,
         List<Compound> compounds, Phase phase) {
            this.name = name;
            this.symbol = symbol;
            this.compounds=compounds;
            this.phase = phase;
    }

    // calculate molecular weight from atomic weight * count
    public double getWeight() {
        double weight = 0;
        for(Compound e : compounds){
            //원소 무게 * 개수 
            weight += e.getPeriodicElement().getMass()*e.getCount();
        }
        return weight;
    }

    //List -> Map<PeriodicElement, Integer> 로 변환 
    public Map<PeriodicElement, Integer> getCompoundMap() {
        Map<PeriodicElement, Integer> compoundMap = new HashMap<>();
        for (Compound compound : compounds) {
            compoundMap.put(compound.getPeriodicElement(), compound.getCount());
        }
        return compoundMap;
    }

    /* getter & setter */
    public String getName(){ return name;}
    public String getSymbol(){return symbol;}
    public List<Compound> getCompounds(){ return compounds;}
    public Phase getPhase(){return phase;}
    public void setName(String name){this.name = name;}
    public void setSymbol(String symbol){this.symbol = symbol;}
    public void setPhase(Phase phase){this.phase = phase;}
    public void setCompounds(List<Compound> compounds){
        this.compounds = compounds;
    }

    //toString
    @Override
    public String toString() {
        return "ChemicalCompound{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", compounds=" + compounds +
                ", phase=" + phase +
                '}';
    }

}
