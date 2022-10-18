import React from 'react'

export const LoginForm = () => {
  return (
    <body class="text-center container p-5">
        <form class="form-signin">
            <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
            <label for="inputEmail" class="sr-only">Email address</label>
            <input type="email" id="inputEmail" class="form-control" pattern="^({a-zA-Z0-9_\-\.)@[a-zA-Z-0-9_\-\.]+)\.([a-zA-Z]{2,5})$" placeholder="Email address" required autofocus/>
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" class="form-control" placeholder="Password" required/>
            <div class="checkbox mb-3">
                <label>
                <input type="checkbox" value="remember-me"/> Remember me
            </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        </form>
    </body>
  )
}
