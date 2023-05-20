package ru.gb.inventory.itactive.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.inventory.itactive.dto.ConditionDto;
import ru.gb.inventory.itactive.entities.Condition;
import ru.gb.inventory.itactive.repositories.ConditionRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ConditionServiceImpl implements ConditionService {

    private final ConditionRepository conditionRepository;

    @Override
    public List<Condition> findAll() {
        return conditionRepository.findAll();
    }

    @Override
    public Optional<Condition> findById(Long id) {
        return conditionRepository.findById(id);
    }

    @Override
    public Optional<Condition> findByTitle(String title) {
        return conditionRepository.findByTitle(title);
    }

    @Override
    public void deleteById(Long id) {
        conditionRepository.deleteById(id);
    }

    @Override
    public void deleteByTitle(String title) {
        conditionRepository.deleteByTitle(title);
    }

    @Override
    public void addNewCondition(ConditionDto conditionDto) {
        Condition condition = new Condition();
        condition.setTitle(condition.getTitle());
        conditionRepository.save(condition);
    }
}
