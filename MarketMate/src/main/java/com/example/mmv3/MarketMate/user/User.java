package com.example.mmv3.MarketMate.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user")
public class User implements UserDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


//    @NotEmpty (message = "First name emm")
//    @NotBlank(message = "First name blnk")
    private String firstname;

//    @Nonnull @NotEmpty @NotBlank
    private String lastname;

//    @Nonnull @NotEmpty @NotBlank @Email
    private String email;

//    @Nonnull @NotEmpty @NotBlank @Size(min = 4, max = 8)
//    private Integer Pin;

//    @Nonnull @NotEmpty @NotBlank @Size(min = 4, max = 8)
    private String password;

    @Enumerated (EnumType.STRING)
    private Role role;

//    @Nonnull
//    private LocalDateTime created_at;

//    @Nonnull
//    private LocalDateTime updated_at;




    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}
