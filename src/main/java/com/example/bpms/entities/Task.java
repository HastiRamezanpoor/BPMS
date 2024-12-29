package com.example.bpms.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "process_id")
    private Process process;

    private String name;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo;

    private String status = "Pending";
    private LocalDateTime dueDate;
}