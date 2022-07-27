import com.tema.entity.Meniu;
import com.tema.entity.Salate;
package com.tema.entity;

public class Desert extends Salate {

    private int pretProdus;


    public Desert(int id, String name, Meniu menu) {
        super(id, name, menu);
    }

    public Desert() {
        public void getPret() {
        }
    }

    public int getPretProdus() {
        return pretProdus;
    }

    public void setPretProdus(int pretProdus) {
        this.pretProdus = pretProdus;
    }

    @Override
    public String toString() {
        return "Desert{" +
                "pretProdus=" + pretProdus +
                '}' +
                " for " +
                super.toString();
    }


}}