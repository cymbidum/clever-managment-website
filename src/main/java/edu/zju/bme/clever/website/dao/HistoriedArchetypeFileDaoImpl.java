package edu.zju.bme.clever.website.dao;

import org.springframework.stereotype.Repository;

import edu.zju.bme.clever.website.entity.HistoriedArchetypeFile;

@Repository("historiedArchetypeFileDao")
public class HistoriedArchetypeFileDaoImpl extends GenericDaoImpl<HistoriedArchetypeFile,Integer> implements HistoriedArchetypeFileDao{

}
