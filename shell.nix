{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  buildInputs = [
    pkgs.jdk21
    pkgs.gradle
    pkgs.git
  ];
}
