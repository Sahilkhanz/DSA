@echo off

if "%1"=="" (
    echo Please provide question name.
    exit /b
)

set name=%1
set ext=%2

if "%ext%"=="" set ext=cpp

mkdir "%name%"
cd "%name%"

type nul > "%name%.%ext%"
type nul > input.txt
type nul > output.txt
type nul > error.txt
type nul > notes.txt
type nul > edge_cases.txt

@REM code "%name%.%ext%" input.txt output.txt error.txt notes.txt edge_cases.txt
@REM code -r "%name%.%ext%" input.txt output.txt error.txt notes.txt edge_cases.txt
code -r "%name%.%ext%"
code -r input.txt
code -r output.txt
code -r error.txt
code -r notes.txt
code -r edge_cases.txt



cd ..
