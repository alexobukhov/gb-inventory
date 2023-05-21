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
    public void deleteById(Long id) {
        kindRepository.deleteById(id);
    }

}
