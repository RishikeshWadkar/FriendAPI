package com.example.friend.api.FriendAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FriendController {

    @Autowired
    private FriendService friendService;

    @GetMapping("/friends")
    public List<Friend> getFriends(){
        return friendService.getFriends();
    }

    @PostMapping("/friends/addnew")
    public void addFriend(@RequestBody Friend friend) {
        friendService.addFriend(friend);
    }

    @PutMapping("/friends/{id}/edit")
    public void updateFriend(@PathVariable("id") Integer id, @RequestBody Friend friend){
        friendService.updateFriend(friend);
    }

    @DeleteMapping("/frends/{id}/delete")
    public void deleterFriend(@PathVariable("id") Integer id){
        friendService.deleteFriend(id);
    }
}
