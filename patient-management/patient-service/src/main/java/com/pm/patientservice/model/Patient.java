package com.pm.patientservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
}
