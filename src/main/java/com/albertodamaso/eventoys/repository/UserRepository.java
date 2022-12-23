package com.albertodamaso.eventoys.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery; 

import com.albertodamaso.eventoys.model.User;

public interface UserRepository  extends JpaRepository<User, Long>{

    @Override
    default void deleteAllByIdInBatch(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default void deleteAllInBatch() {
        // TODO Auto-generated method stub
        
    }

    @Override
    default void deleteAllInBatch(Iterable<User> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default <S extends User> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default void flush() {
        // TODO Auto-generated method stub
        
    }

    @Override
    default User getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default User getOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default User getReferenceById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends User> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default List<User> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default List<User> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends User> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    default void delete(User entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    default void deleteAll(Iterable<? extends User> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default void deleteById(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    default Optional<User> findById(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    default <S extends User> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default List<User> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default Page<User> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends User> long count(Example<S> example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    default <S extends User> boolean exists(Example<S> example) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    default <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends User, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends User> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }
}
