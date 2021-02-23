package com.codeclan.example.demo.components;

import com.codeclan.example.demo.models.File;
import com.codeclan.example.demo.models.Folder;
import com.codeclan.example.demo.models.User;
import com.codeclan.example.demo.repositories.FileRepository;
import com.codeclan.example.demo.repositories.FolderRepository;
import com.codeclan.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User rza = new User("RZA");
        userRepository.save(rza);

        User method = new User("Method Man");
        userRepository.save(method);

        Folder films = new Folder("Films", rza);
        folderRepository.save(films);

        Folder downloads = new Folder("Downloads", method);
        folderRepository.save(downloads);

        Folder music = new Folder("Music", rza);
        folderRepository.save(music);

        File album = new File("Liquid Swords", ".mp3", 500, music);
        fileRepository.save(album);

        File film = new File("Five Deadly Venoms", ".mov", 18000, films);
        fileRepository.save(film);

        File app = new File("Job Application", ".pdf", 10, downloads);
        fileRepository.save(app);

    }
}