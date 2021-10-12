package com.pranay;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;


    public HeavenlyBody(String name, double orbitalPeriod){
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();


    }


    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites(){

        return new HashSet<>(this.satellites);
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Equals called ..");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        String objName = ((HeavenlyBody) o).getName();
return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called ");
        return this.name.hashCode() + 56;
    }
}
