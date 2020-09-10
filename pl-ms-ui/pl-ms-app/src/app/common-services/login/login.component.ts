import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl} from '@angular/forms'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  public loginInvalid: boolean;
  signin: FormGroup = new FormGroup({
    username: new FormControl('', [Validators.min(2), Validators.required ]),
    password: new FormControl('', [Validators.required, Validators.min(3) ])
  });
  hide = true;
  get usernameInput() { return this.signin.get('username'); }
  get passwordInput() { return this.signin.get('password'); } 

  onSubmit(){
    this.loginInvalid = true;
    console.log("uname",this.signin.get('username').value);
    console.log("pwd",this.signin.get('password').value);
  }

}
