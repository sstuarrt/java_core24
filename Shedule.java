package com.company.java_core.homework24.task1;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Shedule {
    Set<Seance> seances = new TreeSet<>();

    public Shedule() {}

    public Shedule(Set<Seance> seances) {
        this.seances = seances;
    }

    public Set<Seance> getSeances() {
        return seances;
    }

    public void setSeances(Set<Seance> seances) {
        this.seances = seances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shedule)) return false;
        Shedule shedule = (Shedule) o;
        return Objects.equals(getSeances(), shedule.getSeances());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSeances());
    }

    public void addSeance(Seance seance) {
        seances.add(seance);
    }

    public void removeSeance(Seance seance) {
        seances.remove(seance);
    }

    @Override
    public String toString() {
        return "Shedule{" +
                "seances=" + seances +
                '}';
    }
}
