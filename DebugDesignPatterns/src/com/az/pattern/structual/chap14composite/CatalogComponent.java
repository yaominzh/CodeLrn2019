package com.az.pattern.structual.chap14composite;

public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("Unsupoorted Add Operation");
    }

    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("Unsupoorted Remove Operation");
    }

    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("Unsupoorted getName Operation");
    }

    public double getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("Unsupoorted getPrice Operation");
    }

    public void print(){
        throw new UnsupportedOperationException("Unsupoorted Print Operation");
    }
}
