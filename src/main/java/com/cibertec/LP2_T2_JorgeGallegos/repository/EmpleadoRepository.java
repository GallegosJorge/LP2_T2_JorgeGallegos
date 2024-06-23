package com.cibertec.LP2_T2_JorgeGallegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.LP2_T2_JorgeGallegos.models.EmpleadoClass;

public interface EmpleadoRepository extends JpaRepository<EmpleadoClass, String> {
	EmpleadoClass findByDniEmpleado(String dniEmpleado);

}
