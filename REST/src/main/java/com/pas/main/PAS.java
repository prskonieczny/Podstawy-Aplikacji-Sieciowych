package com.pas.main;

import jakarta.annotation.security.DeclareRoles;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/")
@ApplicationScoped
@DeclareRoles({"Admin", "Moderator", "Client", "Guest"})
public class PAS extends Application {
}