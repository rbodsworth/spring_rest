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
        User user1 = new User("Paul Wishart");
        userRepository.save(user1);
        User user2 = new User("Natalie Weir");
        userRepository.save(user2);

        Folder folder1 = new Folder("Applications", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Documents", user1);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Images", user1);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("Movies", user2);
        folderRepository.save(folder4);

        Folder folder5 = new Folder("Music", user2);
        folderRepository.save(folder5);

        File file1 = new File("IntelliJ", ".app", 123000, folder1);
        fileRepository.save(file1);

        File file2 = new File("Atom", ".app", 12000, folder1);
        fileRepository.save(file2);

        File file3 = new File("CV", ".word", 238, folder2);
        fileRepository.save(file3);

        File file4 = new File("Split", ".mov", 23800000, folder4);
        fileRepository.save(file4);

        File file5 = new File("Glass", ".mpeg", 23700000, folder4);
        fileRepository.save(file5);

        File file6 = new File("Computer Love", ".mp3", 12800, folder5);
        fileRepository.save(file6);

    }
}