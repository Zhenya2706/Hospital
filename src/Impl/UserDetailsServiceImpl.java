package Impl;

import Service.UserService;

import java.util.ArrayList;

public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        org.springframework.security.core.userdetails.User userDetails = null;

        User user = userService.getUserByUsername(username);

        if(user != null){
            //Set<GrantedAuthority> roles = new HashSet<>();
            List<GrantedAuthority> roles = new ArrayList<>();
            roles.add(new SimpleGrantedAuthority (user.getAuth().getRole().name()));

            userDetails = new org.springframework.security.core.userdetails.User( user.getAuth().getUsername(),
                    user.getAuth().getPassword(),
                    roles);
        }
        return userDetails;
    }
}
