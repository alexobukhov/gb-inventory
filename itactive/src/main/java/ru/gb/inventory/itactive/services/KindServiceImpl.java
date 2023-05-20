package ru.gb.inventory.itactive.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.inventory.itactive.dto.KindDto;
import ru.gb.inventory.itactive.entities.Kind;
import ru.gb.inventory.itactive.repositories.KindRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class KindServiceImpl implements KindService {

    private final KindRepository kindRepository;

    @Override
    public List<Kind> findAll() {
        return kindRepository.findAll();
    }

    @Override
    public void addNewKind(KindDto kindDto) {
        Kind kind = new Kind();
        kind.setTitle(kindDto.getTitle());
        kindRepository.save(kind);
    }

    @Override
    public Optional<Kind> findById(Long id) {
        return kindRepository.findById(id);
    }

    @Override
    public Optional<Kind> findByTitle(String title) {
        return kindRepository.findByTitle(title);
    }

    @Override
    public void deleteById(Long id) {
        kindRepository.deleteById(id);
    }

    @Override
    public void deleteByTitle(String title) {
        kindRepository.deleteByTitle(title);
    }
}
