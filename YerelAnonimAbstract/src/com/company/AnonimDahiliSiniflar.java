package com.company;

public class AnonimDahiliSiniflar {

    Canli canli = new Canli() {
        @Override
        public void yemekYe() {

        }

        @Override
        public void suIc() {

        }

        @Override
        public void yasa() {

        }
    };

    Canli2 canli2 = new Canli2() {
        @Override
        void yemekYe() {

        }

        @Override
        void suIc() {

        }

        @Override
        void yasa() {

        }
    };
    public interface Canli{

        void yemekYe();
        void suIc();
        void yasa();

    }
    public abstract class Canli2{

        abstract void yemekYe();
        abstract void suIc();
        abstract void yasa();

    }
}
