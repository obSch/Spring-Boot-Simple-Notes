package com.obmaikano.simplenotes.repository;

import com.obmaikano.simplenotes.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long>{

}
