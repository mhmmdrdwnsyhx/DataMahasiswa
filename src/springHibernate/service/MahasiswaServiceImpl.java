/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springHibernate.service;

import springHibernate.dao.MahasiswaDao;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springHibernate.model.Mahasiswa;

/**
 *
 * @author DELL
 */

@Service("MahasiswaService")
//@Transactional(readOnly = true)
public class MahasiswaServiceImpl implements MahasiswaService{
    @Autowired
    private MahasiswaDao mahasiswaDao;
    
    @Transactional
    @Override
    public void save(Mahasiswa mahasiswa) {
        mahasiswaDao.save(mahasiswa);
    }
    
    @Transactional
    @Override
    public void update(Mahasiswa mahasiswa) {
        mahasiswaDao.update(mahasiswa);
    }
    
    @Transactional
    @Override
    public void delete(Mahasiswa mahasiswa) {
        mahasiswaDao.delete(mahasiswa);
    }
    
    @Transactional
    public Mahasiswa getMahasiswa(String npm) {
        return mahasiswaDao.getMahasiswa(npm);
    }   

    @Transactional
    @Override
    public List<Mahasiswa> getMahasiswa() {
        return mahasiswaDao.getMahasiswas();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}