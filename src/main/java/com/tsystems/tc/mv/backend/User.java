package com.tsystems.tc.mv.backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Ein Nutzer mit username und vollstaendigem Name.
 *
 * username muss eigentlich eindeutig sein, diese Anforderung wird aber noch nicht
 * programmatisch abgesichert.
 *
 * @author Marco Grunert <marco.grunert@t-systems.com>
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String firstName;

    private String lastName;

    protected User() {
    }

    public User(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(getUsername(), user.getUsername())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                .append(getUsername())
                .toHashCode();
    }
}
