/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springHibernate.service;

import java.util.List;
import springHibernate.model.Mahasiswa;

/**
 *
 * @author DELL
 */
public interface MahasiswaService {
    public void save(Mahasiswa mahasiswa);
    public void update(Mahasiswa mahasiswa);
    public void delete(Mahasiswa mahasiswa);
    public List<Mahasiswa> getMahasiswa();
}