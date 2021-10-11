package com.spring.example.dao;

import com.spring.example.entity.CourseDescription;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CourseDescriptionDAOImpl implements CourseDescriptionDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<CourseDescription> getDescription() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<CourseDescription> cq = cb.createQuery(CourseDescription.class);
        Root<CourseDescription> root = cq.from(CourseDescription.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void saveDescription(CourseDescription courseDescription) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(courseDescription);
    }

    @Override
    public CourseDescription getDescription(int id) {
        Session session = sessionFactory.getCurrentSession();
        CourseDescription dc = session.get(CourseDescription.class, id);
        return dc;
    }

    @Override
    public void deleteDescription(int id) {
        Session session = sessionFactory.getCurrentSession();
        CourseDescription dc = session.byId(CourseDescription.class).load(id);
        session.delete(dc);
    }
}
